<template>
<div :style='{"width":"85%","padding":"20px","margin":"10px auto","position":"relative","background":"rgba(255,255,255,0.8)"}'>
    <el-form
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="120px"
    >
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="用户账号" prop="yonghuzhanghao">
            <el-input v-model="ruleForm.yonghuzhanghao" 
                placeholder="用户账号" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="密码" prop="mima">
            <el-input v-model="ruleForm.mima" 
                placeholder="密码" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="姓名" prop="xingming">
            <el-input v-model="ruleForm.xingming" 
                placeholder="姓名" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="头像" v-if="type!='cross' || (type=='cross' && !ro.touxiang)" prop="touxiang">
            <file-upload
            tip="点击上传头像"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
            @change="touxiangUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' class="upload" v-else label="头像" prop="touxiang">
                <img v-if="ruleForm.touxiang.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.touxiang.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.touxiang.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}'  label="性别" prop="xingbie">
            <el-select v-model="ruleForm.xingbie" placeholder="请选择性别"  >
              <el-option
                  v-for="(item,index) in xingbieOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="手机号码" prop="shoujihaoma">
            <el-input v-model="ruleForm.shoujihaoma" 
                placeholder="手机号码" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="邮箱" prop="youxiang">
            <el-input v-model="ruleForm.youxiang" 
                placeholder="邮箱" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="身份证号" prop="shenfenzhenghao">
            <el-input v-model="ruleForm.shenfenzhenghao" 
                placeholder="身份证号" clearable ></el-input>
          </el-form-item>

      <el-form-item :style='{"padding":"0","textAlign":"center","margin":"0"}'>
        <el-button :style='{"border":"1px solid #9179f2","cursor":"pointer","padding":"0","boxShadow":"inset 0px 0px 56px 0px #7e5ffb","margin":"0 20px 0 0","color":"#111","outline":"none","borderRadius":"4px","background":"#fff","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"1px solid #dfd130","cursor":"pointer","padding":"0","boxShadow":"inset 0px 0px 36px 0px #f2e013","margin":"0","color":"#111","outline":"none","borderRadius":"4px","background":"#fff","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
      return {
        id: '',
        baseUrl: '',
        ro:{
            yonghuzhanghao : false,
            mima : false,
            xingming : false,
            touxiang : false,
            xingbie : false,
            shoujihaoma : false,
            youxiang : false,
            shenfenzhenghao : false,
            sfsh : false,
            shhf : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          yonghuzhanghao: '',
          mima: '',
          xingming: '',
          touxiang: '',
          xingbie: '',
          shoujihaoma: '',
          youxiang: '',
          shenfenzhenghao: '',
        },
        xingbieOptions: [],
        rules: {
          yonghuzhanghao: [
            { required: true, message: '用户账号不能为空', trigger: 'blur' },
          ],
          mima: [
            { required: true, message: '密码不能为空', trigger: 'blur' },
          ],
          xingming: [
          ],
          touxiang: [
          ],
          xingbie: [
          ],
          shoujihaoma: [
            { validator: this.$validate.isMobile, trigger: 'blur' },
          ],
          youxiang: [
            { validator: this.$validate.isEmail, trigger: 'blur' },
          ],
          shenfenzhenghao: [
            { validator: this.$validate.isIdCard, trigger: 'blur' },
          ],
          sfsh: [
          ],
          shhf: [
          ],
        },
      };
    },
    computed: {



    },
    created() {
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='yonghuzhanghao'){
              this.ruleForm.yonghuzhanghao = obj[o];
              this.ro.yonghuzhanghao = true;
              continue;
            }
            if(o=='mima'){
              this.ruleForm.mima = obj[o];
              this.ro.mima = true;
              continue;
            }
            if(o=='xingming'){
              this.ruleForm.xingming = obj[o];
              this.ro.xingming = true;
              continue;
            }
            if(o=='touxiang'){
              this.ruleForm.touxiang = obj[o].split(",")[0];
              this.ro.touxiang = true;
              continue;
            }
            if(o=='xingbie'){
              this.ruleForm.xingbie = obj[o];
              this.ro.xingbie = true;
              continue;
            }
            if(o=='shoujihaoma'){
              this.ruleForm.shoujihaoma = obj[o];
              this.ro.shoujihaoma = true;
              continue;
            }
            if(o=='youxiang'){
              this.ruleForm.youxiang = obj[o];
              this.ro.youxiang = true;
              continue;
            }
            if(o=='shenfenzhenghao'){
              this.ruleForm.shenfenzhenghao = obj[o];
              this.ro.shenfenzhenghao = true;
              continue;
            }
          }
        }
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
          }
        });
        this.xingbieOptions = "男,女".split(',')
      },

    // 多级联动参数
      // 多级联动参数
      info(id) {
        this.$http.get('yonghu/detail/${id}', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

        //更新跨表属性
        var crossuserid;
        var crossrefid;
        var crossoptnum;
        this.$refs["ruleForm"].validate(valid => {
          if(valid) {
            if(this.type=='cross'){
                 var statusColumnName = localStorage.getItem('statusColumnName');
                 var statusColumnValue = localStorage.getItem('statusColumnValue');
                 if(statusColumnName && statusColumnName!='') {
                     var obj = JSON.parse(localStorage.getItem('crossObj'));
                     if(!statusColumnName.startsWith("[")) {
                         for (var o in obj){
                             if(o==statusColumnName){
                                 obj[o] = statusColumnValue;
                             }
                         }
                         var table = localStorage.getItem('crossTable');
                         this.$http.post(table+'/update', obj).then(res => {});
                     } else {
                            crossuserid=Number(localStorage.getItem('userid'));
                            crossrefid=obj['id'];
                            crossoptnum=localStorage.getItem('statusColumnName');
                            crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                     }
                 }
            }
            if(crossrefid && crossuserid) {
                 this.ruleForm.crossuserid=crossuserid;
                 this.ruleForm.crossrefid=crossrefid;
                 var params = {
                     page: 1,
                     limit: 10,
                     crossuserid:crossuserid,
                     crossrefid:crossrefid,
                 }
                 this.$http.get('yonghu/list', {
                  params: params
                 }).then(res => {
                     if(res.data.data.total>=crossoptnum) {
                         this.$message({
                          message: localStorage.getItem('tips'),
                          type: 'success',
                          duration: 1500,
                         });
                          return false;
                     } else {
                         // 跨表计算


                          this.$http.post('yonghu/add', this.ruleForm).then(res => {
                              if (res.data.code == 0) {
                                  this.$message({
                                      message: '操作成功',
                                      type: 'success',
                                      duration: 1500,
                                      onClose: () => {
                                          this.$router.go(-1);
                                      }
                                  });
                              } else {
                                  this.$message({
                                      message: res.data.msg,
                                      type: 'error',
                                      duration: 1500
                                  });
                              }
                          });
                     }
                 });
             } else {


                  this.$http.post('yonghu/add', this.ruleForm).then(res => {
                     if (res.data.code == 0) {
                          this.$message({
                              message: '操作成功',
                              type: 'success',
                              duration: 1500,
                              onClose: () => {
                                  this.$router.go(-1);
                              }
                          });
                      } else {
                          this.$message({
                              message: res.data.msg,
                              type: 'error',
                              duration: 1500
                          });
                      }
                  });
             }
          }
        });
      },
      // 获取uuid
      getUUID () {
        return new Date().getTime();
      },
      // 返回
      back() {
        this.$router.go(-1);
      },
      touxiangUploadChange(fileUrls) {
          this.ruleForm.touxiang = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #7e5ffb;
	  font-weight: 500;
	  width: 120px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 120px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  border: 0;
	  border-radius: 4px;
	  padding: 0 12px;
	  outline: none;
	  color: #333;
	  background: linear-gradient(240deg, rgba(246,246,246,1) 0%, rgba(246,246,246,1) 50%, rgba(238,238,238,1) 50%, rgba(238,238,238,1) 100%);
	  width: auto;
	  font-size: 14px;
	  min-width: 400px;
	  height: 40px;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border: 0;
	  border-radius: 4px;
	  padding: 0 10px;
	  outline: none;
	  color: #333;
	  background: linear-gradient(240deg, rgba(246,246,246,1) 0%, rgba(246,246,246,1) 50%, rgba(238,238,238,1) 50%, rgba(238,238,238,1) 100%);
	  width: auto;
	  font-size: 14px;
	  min-width: 200px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border: 0;
	  border-radius: 4px;
	  padding: 0 10px 0 30px;
	  outline: none;
	  color: #333;
	  background: linear-gradient(240deg, rgba(246,246,246,1) 0%, rgba(246,246,246,1) 50%, rgba(238,238,238,1) 50%, rgba(238,238,238,1) 100%);
	  width: auto;
	  font-size: 14px;
	  min-width: 300px;
	  height: 40px;
	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  border: 1px dashed #ddd;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #999;
	  background: linear-gradient(240deg, rgba(246,246,246,1) 0%, rgba(246,246,246,1) 50%, rgba(238,238,238,1) 50%, rgba(238,238,238,1) 100%);
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  border: 1px dashed #ddd;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #999;
	  background: linear-gradient(240deg, rgba(246,246,246,1) 0%, rgba(246,246,246,1) 50%, rgba(238,238,238,1) 50%, rgba(238,238,238,1) 100%);
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  border: 1px dashed #ddd;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #999;
	  background: linear-gradient(240deg, rgba(246,246,246,1) 0%, rgba(246,246,246,1) 50%, rgba(238,238,238,1) 50%, rgba(238,238,238,1) 100%);
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 0;
	  border-radius: 4px;
	  padding: 12px;
	  outline: none;
	  color: #333;
	  background: linear-gradient(240deg, rgba(246,246,246,1) 0%, rgba(246,246,246,1) 50%, rgba(238,238,238,1) 50%, rgba(238,238,238,1) 100%);
	  width: auto;
	  font-size: 14px;
	  min-width: 400px;
	  height: 120px;
	}
</style>

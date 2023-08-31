<template>
	<div>

	<div class="container" :style='{"minHeight":"100vh","alignItems":"center","background":"url(http://codegen.caihongy.cn/20230117/7929bf8c61b346319944c0d8bfe3dc60.jpg) no-repeat center bottom / 100% 100%,#fff","display":"flex","width":"100%","backgroundSize":"cover","backgroundPosition":"center center","backgroundRepeat":"no-repeat","justifyContent":"center"}'>
		<el-form class='rgs-form' v-if="pageFlag=='register'" :style='{"width":"800px","padding":"20px","margin":"0","borderRadius":"50px","background":"#fff","height":"auto"}' ref="registerForm" :model="registerForm" :rules="rules">
			<div v-if="false" :style='{"margin":"0 0 10px 0","color":"rgba(64, 158, 255, 1)","textAlign":"center","width":"100%","lineHeight":"44px","fontSize":"20px","textShadow":"4px 4px 2px rgba(64, 158, 255, .5)"}'>USER / REGISTER</div>
			<div v-if="true" :style='{"width":"100%","margin":"10px 0","lineHeight":"44px","fontSize":"20px","color":"#333","textAlign":"center"}'>房屋租赁管理系统注册</p></div>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 26px","height":"auto"}' v-if="tableName=='yonghu'" prop="yonghuzhanghao">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>用户账号：</div>
				<el-input v-model="registerForm.yonghuzhanghao"  placeholder="请输入用户账号" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 26px","height":"auto"}' v-if="tableName=='yonghu'" prop="mima">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>密码：</div>
				<el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 26px","height":"auto"}' v-if="tableName=='yonghu'" prop="mima">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>确认密码：</div>
				<el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 26px","height":"auto"}' v-if="tableName=='yonghu'" prop="xingming">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>姓名：</div>
				<el-input v-model="registerForm.xingming"  placeholder="请输入姓名" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 26px","height":"auto"}' v-if="tableName=='yonghu'" prop="touxiang">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>头像：</div>
                <file-upload
					tip="点击上传头像"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.touxiang?registerForm.touxiang:''"
					@change="yonghutouxiangUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 26px","height":"auto"}' v-if="tableName=='yonghu'" prop="xingbie">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>性别：</div>
                <el-select v-model="registerForm.xingbie" placeholder="请选择性别" >
                  <el-option
                      v-for="(item,index) in yonghuxingbieOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 26px","height":"auto"}' v-if="tableName=='yonghu'" prop="shoujihaoma">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>手机号码：</div>
				<el-input v-model="registerForm.shoujihaoma"  placeholder="请输入手机号码" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 26px","height":"auto"}' v-if="tableName=='yonghu'" prop="youxiang">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>邮箱：</div>
				<el-input v-model="registerForm.youxiang"  placeholder="请输入邮箱" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 26px","height":"auto"}' v-if="tableName=='yonghu'" prop="shenfenzhenghao">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>身份证号：</div>
				<el-input v-model="registerForm.shenfenzhenghao"  placeholder="请输入身份证号" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 26px","height":"auto"}' v-if="tableName=='fangzhu'" prop="fangzhuzhanghao">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>房主账号：</div>
				<el-input v-model="registerForm.fangzhuzhanghao"  placeholder="请输入房主账号" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 26px","height":"auto"}' v-if="tableName=='fangzhu'" prop="mima">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>密码：</div>
				<el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 26px","height":"auto"}' v-if="tableName=='fangzhu'" prop="mima">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>确认密码：</div>
				<el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 26px","height":"auto"}' v-if="tableName=='fangzhu'" prop="fangzhuxingming">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>房主姓名：</div>
				<el-input v-model="registerForm.fangzhuxingming"  placeholder="请输入房主姓名" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 26px","height":"auto"}' v-if="tableName=='fangzhu'" prop="touxiang">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>头像：</div>
                <file-upload
					tip="点击上传头像"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.touxiang?registerForm.touxiang:''"
					@change="fangzhutouxiangUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 26px","height":"auto"}' v-if="tableName=='fangzhu'" prop="xingbie">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>性别：</div>
                <el-select v-model="registerForm.xingbie" placeholder="请选择性别" >
                  <el-option
                      v-for="(item,index) in fangzhuxingbieOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 26px","height":"auto"}' v-if="tableName=='fangzhu'" prop="lianxidianhua">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>联系电话：</div>
				<el-input v-model="registerForm.lianxidianhua"  placeholder="请输入联系电话" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 26px","height":"auto"}' v-if="tableName=='fangzhu'" prop="shenfenzhenghao">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>身份证号：</div>
				<el-input v-model="registerForm.shenfenzhenghao"  placeholder="请输入身份证号" />
			</el-form-item>
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"20px auto 5px","outline":"none","color":"#fff","borderRadius":"8px","background":"#7e5ffb","display":"block","width":"30%","fontSize":"16px","height":"44px"}' type="primary" @click="submitForm('registerForm')">注册</el-button>
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","boxShadow":"0 0 6px rgba(64, 158, 255, .5)","margin":"20px auto 5px","color":"#fff","display":"none","outline":"none","borderRadius":"8px","background":"rgba(64, 158, 255, 1)","width":"80%","fontSize":"16px","height":"44px"}' @click="resetForm('registerForm')">重置</el-button>
			<router-link :style='{"cursor":"pointer","padding":"0 10%","color":"rgba(159, 159, 159, 1)","textAlign":"center","display":"inline-block","width":"100%","lineHeight":"2","fontSize":"12px","textDecoration":"none"}' to="/login">已有账户登录</router-link>
		</el-form>
    </div>
  </div>
</div>
</template>

<script>

export default {
    //数据集合
    data() {
		return {
            pageFlag : '',
			tableName: '',
			registerForm: {
                xingbie: '',
                xingbie: '',
            },
			rules: {},
            yonghuxingbieOptions: [],
            fangzhuxingbieOptions: [],
		}
    },
	mounted() {
	},
    created() {
      this.pageFlag = this.$route.query.pageFlag;
      this.tableName = this.$route.query.role;
      if ('yonghu' == this.tableName) {
        this.rules.yonghuzhanghao = [{ required: true, message: '请输入用户账号', trigger: 'blur' }];
      }
      if ('yonghu' == this.tableName) {
        this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
      }
        this.yonghuxingbieOptions = "男,女".split(',');
      if ('yonghu' == this.tableName) {
        this.rules.shoujihaoma = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
      }
      if ('yonghu' == this.tableName) {
        this.rules.youxiang = [{ required: true, validator: this.$validate.isEmail, trigger: 'blur' }];
      }
      if ('yonghu' == this.tableName) {
        this.rules.shenfenzhenghao = [{ required: true, validator: this.$validate.isIdCard, trigger: 'blur' }];
      }
      if ('fangzhu' == this.tableName) {
        this.rules.fangzhuzhanghao = [{ required: true, message: '请输入房主账号', trigger: 'blur' }];
      }
      if ('fangzhu' == this.tableName) {
        this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
      }
      if ('fangzhu' == this.tableName) {
        this.rules.fangzhuxingming = [{ required: true, message: '请输入房主姓名', trigger: 'blur' }];
      }
        this.fangzhuxingbieOptions = "男,女".split(',');
      if ('fangzhu' == this.tableName) {
        this.rules.lianxidianhua = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
      }
      if ('fangzhu' == this.tableName) {
        this.rules.shenfenzhenghao = [{ required: true, validator: this.$validate.isIdCard, trigger: 'blur' }];
      }
    },
    //方法集合
    methods: {
      // 获取uuid
      getUUID () {
        return new Date().getTime();
      },
        // 下二随
      yonghutouxiangUploadChange(fileUrls) {
          this.registerForm.touxiang = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
      fangzhutouxiangUploadChange(fileUrls) {
          this.registerForm.touxiang = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },

        // 多级联动参数


      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            var url=this.tableName+"/register";
               if(`yonghu` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
               if(`fangzhu` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
            this.$http.post(url, this.registerForm).then(res => {
              if (res.data.code === 0) {
                this.$message({
                  message: '注册成功',
                  type: 'success',
                  duration: 1500,
                  onClose: () => {
                    this.$router.push('/login');
                  }
                });
              } else {
                this.$message.error(res.data.msg);
              }
            });
          } else {
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.container {
		position: relative;
		background: url(http://codegen.caihongy.cn/20230117/7929bf8c61b346319944c0d8bfe3dc60.jpg) no-repeat center bottom / 100% 100%,#fff;

		.el-date-editor.el-input {
			width: 100%;
		}
		
		.rgs-form .el-input /deep/ .el-input__inner {
						border: 1px solid #ddd;
						border-radius: 0;
						padding: 0 10px;
						outline: none;
						color: #333;
						background: linear-gradient(240deg, rgba(246,246,246,1) 0%, rgba(246,246,246,1) 50%, rgba(238,238,238,1) 50%, rgba(238,238,238,1) 100%);
						width: 100%;
						font-size: 14px;
						height: 40px;
					}
		
		.rgs-form .el-select /deep/ .el-input__inner {
						border: 1px solid #ddd;
						border-radius: 0;
						padding: 0 10px;
						outline: none;
						color: #333;
						background: linear-gradient(240deg, rgba(246,246,246,1) 0%, rgba(246,246,246,1) 50%, rgba(238,238,238,1) 50%, rgba(238,238,238,1) 100%);
						width: 288px;
						font-size: 14px;
						height: 40px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 1px solid #ddd;
						border-radius: 0;
						padding: 0 10px 0 30px;
						outline: none;
						color: #333;
						background: linear-gradient(240deg, rgba(246,246,246,1) 0%, rgba(246,246,246,1) 50%, rgba(238,238,238,1) 50%, rgba(238,238,238,1) 100%);
						width: 288px;
						font-size: 14px;
						height: 40px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 1px solid #ddd;
						border-radius: 0;
						padding: 0 10px 0 30px;
						outline: none;
						color: #333;
						background: linear-gradient(240deg, rgba(246,246,246,1) 0%, rgba(246,246,246,1) 50%, rgba(238,238,238,1) 50%, rgba(238,238,238,1) 100%);
						width: 288px;
						font-size: 14px;
						height: 40px;
					}
		
		.rgs-form /deep/ .el-upload--picture-card {
			background: transparent;
			border: 0;
			border-radius: 0;
			width: auto;
			height: auto;
			line-height: initial;
			vertical-align: middle;
		}
		
		.rgs-form /deep/ .upload .upload-img {
		  		  border: 1px solid #ddd;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #ddd;
		  		  background: linear-gradient(240deg, rgba(246,246,246,1) 0%, rgba(246,246,246,1) 50%, rgba(238,238,238,1) 50%, rgba(238,238,238,1) 100%);
		  		  width: 80px;
		  		  font-size: 32px;
		  		  line-height: 80px;
		  		  text-align: center;
		  		  height: 80px;
		  		}
		
		.rgs-form /deep/ .el-upload-list .el-upload-list__item {
		  		  border: 1px solid #ddd;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #ddd;
		  		  background: linear-gradient(240deg, rgba(246,246,246,1) 0%, rgba(246,246,246,1) 50%, rgba(238,238,238,1) 50%, rgba(238,238,238,1) 100%);
		  		  width: 80px;
		  		  font-size: 32px;
		  		  line-height: 80px;
		  		  text-align: center;
		  		  height: 80px;
		  		}
		
		.rgs-form /deep/ .el-upload .el-icon-plus {
		  		  border: 1px solid #ddd;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #ddd;
		  		  background: linear-gradient(240deg, rgba(246,246,246,1) 0%, rgba(246,246,246,1) 50%, rgba(238,238,238,1) 50%, rgba(238,238,238,1) 100%);
		  		  width: 80px;
		  		  font-size: 32px;
		  		  line-height: 80px;
		  		  text-align: center;
		  		  height: 80px;
		  		}
	}
</style>

export function isAuth(tableName, key) {
  let role = localStorage.getItem("UserTableName");
  let menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["新增","查看","修改","删除","审核"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["新增","查看","修改","删除","审核"],"menu":"房主","menuJump":"列表","tableName":"fangzhu"}],"menu":"房主管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["新增","查看","修改","删除"],"menu":"房源分类","menuJump":"列表","tableName":"fangyuanfenlei"}],"menu":"房源分类管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除","审核"],"menu":"房屋租赁","menuJump":"列表","tableName":"fangwuzulin"}],"menu":"房屋租赁管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","修改","删除"],"menu":"预约看房","menuJump":"列表","tableName":"yuyuekanfang"}],"menu":"预约看房管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","修改","删除"],"menu":"租赁订单","menuJump":"列表","tableName":"zulindingdan"}],"menu":"租赁订单管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","修改","删除"],"menu":"房租缴纳","menuJump":"列表","tableName":"fangzujiaona"}],"menu":"房租缴纳管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","修改","删除"],"menu":"房屋退租","menuJump":"列表","tableName":"fangwutuizu"}],"menu":"房屋退租管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看","修改","删除"],"menu":"报修信息","menuJump":"列表","tableName":"baoxiuxinxi"}],"menu":"报修信息管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"房屋资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","预约看房","租赁"],"menu":"房屋租赁列表","menuJump":"列表","tableName":"fangwuzulin"}],"menu":"房屋租赁模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","删除"],"menu":"预约看房","menuJump":"列表","tableName":"yuyuekanfang"}],"menu":"预约看房管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","房屋退租","报修"],"menu":"租赁订单","menuJump":"列表","tableName":"zulindingdan"}],"menu":"租赁订单管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","支付"],"menu":"房租缴纳","menuJump":"列表","tableName":"fangzujiaona"}],"menu":"房租缴纳管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看"],"menu":"房屋退租","menuJump":"列表","tableName":"fangwutuizu"}],"menu":"房屋退租管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看","修改","删除"],"menu":"报修信息","menuJump":"列表","tableName":"baoxiuxinxi"}],"menu":"报修信息管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","预约看房","租赁"],"menu":"房屋租赁列表","menuJump":"列表","tableName":"fangwuzulin"}],"menu":"房屋租赁模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除"],"menu":"房屋租赁","menuJump":"列表","tableName":"fangwuzulin"}],"menu":"房屋租赁管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","审核","删除"],"menu":"预约看房","menuJump":"列表","tableName":"yuyuekanfang"}],"menu":"预约看房管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","房租缴纳"],"menu":"租赁订单","menuJump":"列表","tableName":"zulindingdan"}],"menu":"租赁订单管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看"],"menu":"房租缴纳","menuJump":"列表","tableName":"fangzujiaona"}],"menu":"房租缴纳管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","审核"],"menu":"房屋退租","menuJump":"列表","tableName":"fangwutuizu"}],"menu":"房屋退租管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看","审核"],"menu":"报修信息","menuJump":"列表","tableName":"baoxiuxinxi"}],"menu":"报修信息管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","预约看房","租赁"],"menu":"房屋租赁列表","menuJump":"列表","tableName":"fangwuzulin"}],"menu":"房屋租赁模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"房主","tableName":"fangzhu"}];
  for(let i=0;i<menus.length;i++){
    if(menus[i].tableName==role){
      for(let j=0;j<menus[i].frontMenu.length;j++){
          for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
            if(tableName==menus[i].frontMenu[j].child[k].tableName){
              let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
              return buttons.indexOf(key) !== -1 || false
            }
          }
      }
    }
  }
  return false;
}

/**
 *  * 获取当前时间（yyyy-MM-dd hh:mm:ss）
 *   */
export function getCurDateTime() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate(),
    hour = currentTime.getHours(),
    minute = currentTime.getMinutes(),
    second = currentTime.getSeconds();
    return year + "-" + month + "-" + day + " " +hour +":" +minute+":"+second;
}

/**
 *  * 获取当前日期（yyyy-MM-dd）
 *   */
export function getCurDate() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate();
    return year + "-" + month + "-" + day;
}

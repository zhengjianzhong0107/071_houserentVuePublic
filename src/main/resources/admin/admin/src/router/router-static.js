import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import yuyuekanfang from '@/views/modules/yuyuekanfang/list'
    import news from '@/views/modules/news/list'
    import baoxiuxinxi from '@/views/modules/baoxiuxinxi/list'
    import fangzhu from '@/views/modules/fangzhu/list'
    import fangyuanfenlei from '@/views/modules/fangyuanfenlei/list'
    import yonghu from '@/views/modules/yonghu/list'
    import fangwutuizu from '@/views/modules/fangwutuizu/list'
    import fangzujiaona from '@/views/modules/fangzujiaona/list'
    import fangwuzulin from '@/views/modules/fangwuzulin/list'
    import zulindingdan from '@/views/modules/zulindingdan/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/yuyuekanfang',
        name: '预约看房',
        component: yuyuekanfang
      }
      ,{
	path: '/news',
        name: '房屋资讯',
        component: news
      }
      ,{
	path: '/baoxiuxinxi',
        name: '报修信息',
        component: baoxiuxinxi
      }
      ,{
	path: '/fangzhu',
        name: '房主',
        component: fangzhu
      }
      ,{
	path: '/fangyuanfenlei',
        name: '房源分类',
        component: fangyuanfenlei
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/fangwutuizu',
        name: '房屋退租',
        component: fangwutuizu
      }
      ,{
	path: '/fangzujiaona',
        name: '房租缴纳',
        component: fangzujiaona
      }
      ,{
	path: '/fangwuzulin',
        name: '房屋租赁',
        component: fangwuzulin
      }
      ,{
	path: '/zulindingdan',
        name: '租赁订单',
        component: zulindingdan
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '系统首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;

import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import fangzhuList from '../pages/fangzhu/list'
import fangzhuDetail from '../pages/fangzhu/detail'
import fangzhuAdd from '../pages/fangzhu/add'
import fangyuanfenleiList from '../pages/fangyuanfenlei/list'
import fangyuanfenleiDetail from '../pages/fangyuanfenlei/detail'
import fangyuanfenleiAdd from '../pages/fangyuanfenlei/add'
import fangwuzulinList from '../pages/fangwuzulin/list'
import fangwuzulinDetail from '../pages/fangwuzulin/detail'
import fangwuzulinAdd from '../pages/fangwuzulin/add'
import yuyuekanfangList from '../pages/yuyuekanfang/list'
import yuyuekanfangDetail from '../pages/yuyuekanfang/detail'
import yuyuekanfangAdd from '../pages/yuyuekanfang/add'
import zulindingdanList from '../pages/zulindingdan/list'
import zulindingdanDetail from '../pages/zulindingdan/detail'
import zulindingdanAdd from '../pages/zulindingdan/add'
import fangzujiaonaList from '../pages/fangzujiaona/list'
import fangzujiaonaDetail from '../pages/fangzujiaona/detail'
import fangzujiaonaAdd from '../pages/fangzujiaona/add'
import fangwutuizuList from '../pages/fangwutuizu/list'
import fangwutuizuDetail from '../pages/fangwutuizu/detail'
import fangwutuizuAdd from '../pages/fangwutuizu/add'
import baoxiuxinxiList from '../pages/baoxiuxinxi/list'
import baoxiuxinxiDetail from '../pages/baoxiuxinxi/detail'
import baoxiuxinxiAdd from '../pages/baoxiuxinxi/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'fangzhu',
					component: fangzhuList
				},
				{
					path: 'fangzhuDetail',
					component: fangzhuDetail
				},
				{
					path: 'fangzhuAdd',
					component: fangzhuAdd
				},
				{
					path: 'fangyuanfenlei',
					component: fangyuanfenleiList
				},
				{
					path: 'fangyuanfenleiDetail',
					component: fangyuanfenleiDetail
				},
				{
					path: 'fangyuanfenleiAdd',
					component: fangyuanfenleiAdd
				},
				{
					path: 'fangwuzulin',
					component: fangwuzulinList
				},
				{
					path: 'fangwuzulinDetail',
					component: fangwuzulinDetail
				},
				{
					path: 'fangwuzulinAdd',
					component: fangwuzulinAdd
				},
				{
					path: 'yuyuekanfang',
					component: yuyuekanfangList
				},
				{
					path: 'yuyuekanfangDetail',
					component: yuyuekanfangDetail
				},
				{
					path: 'yuyuekanfangAdd',
					component: yuyuekanfangAdd
				},
				{
					path: 'zulindingdan',
					component: zulindingdanList
				},
				{
					path: 'zulindingdanDetail',
					component: zulindingdanDetail
				},
				{
					path: 'zulindingdanAdd',
					component: zulindingdanAdd
				},
				{
					path: 'fangzujiaona',
					component: fangzujiaonaList
				},
				{
					path: 'fangzujiaonaDetail',
					component: fangzujiaonaDetail
				},
				{
					path: 'fangzujiaonaAdd',
					component: fangzujiaonaAdd
				},
				{
					path: 'fangwutuizu',
					component: fangwutuizuList
				},
				{
					path: 'fangwutuizuDetail',
					component: fangwutuizuDetail
				},
				{
					path: 'fangwutuizuAdd',
					component: fangwutuizuAdd
				},
				{
					path: 'baoxiuxinxi',
					component: baoxiuxinxiList
				},
				{
					path: 'baoxiuxinxiDetail',
					component: baoxiuxinxiDetail
				},
				{
					path: 'baoxiuxinxiAdd',
					component: baoxiuxinxiAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})

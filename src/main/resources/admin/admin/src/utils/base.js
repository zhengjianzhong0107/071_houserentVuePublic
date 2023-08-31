const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot503nz/",
            name: "springboot503nz",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot503nz/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "房屋租赁管理系统"
        } 
    }
}
export default base

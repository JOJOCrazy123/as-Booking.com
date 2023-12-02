import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
  {
    path: '/home',
    name: 'home',
    component: () => import('../views/element/HomeView.vue'),
  },
  {
    path: '/log',
    name: 'log',
    component: () => import('../views/element/ElementView.vue')
  },
  {
    path: '/log2',
    name: 'log2',
    component: () => import('../views/element/ElementView2.vue'),
    props: (route) => ({
      log1data: route.params.log1data
    })
  },
  {
    path: '/log3',
    name: 'log3',
    component: () => import('../views/element/ElementView3.vue'),
    props: (route) => ({
      log1data: route.params.log1data
    })
  },
  {
    path: '/log4/:RegisteredMailbox',// 添加参数
    name: 'log4',
    component: () => import('../views/element/ElementView4.vue'),
  },
  {
    path: '/log5/:RegisteredMailbox',
    name: 'log5',
    component: () => import('../views/element/ElementView5.vue')
  },
  {
    path: '/test',
    name: 'test',
    component: () => import('../components/Test_Connection.vue')
  },
  {
    path:'/',
    redirect: '/home',
    // redirect:'/test',
  },
]

const router = new VueRouter({
  routes
})

export default router

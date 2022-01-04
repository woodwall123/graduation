import Vue from 'vue'
import Router from 'vue-router'
import homePage from '@/pages/homePage.vue'
import destination from '@/pages/destination.vue'
import navBar from '@/components/navBar.vue'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      redirect: '/navBar/homePage'
    },
    {
      path: '/navBar',
      component: navBar,
      children: [
        {
          path: 'destination',
          component: destination
        },
        {
          path: 'homePage',
          name: 'homePage',
          component: homePage
        }
      ]
    }
  ]
})

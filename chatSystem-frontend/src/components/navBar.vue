<template>
<div>
 <nav>
   <div class="logo"></div>
   <router-link to="/navBar/homePage" exact="" class="link"><div class="el-menu-item">首页</div></router-link>
   <router-link to="/navBar/destination" exact="" class="link"><div class="el-menu-item">目的地</div></router-link>
   <router-link to="/" exact="" class="link"><div class="el-menu-item">酒店推荐</div></router-link>
   <router-link to="/" exact="" class="link"> <div class="el-menu-item">交通推荐</div></router-link>
   <router-link to="/" exact="" class="link"><div class="el-menu-item">登录</div></router-link>
   <router-link to="/" exact="" class="link"><div class="el-menu-item">注册</div></router-link>
 </nav>
   <router-view />
</div>
</template>

<script>
export default {
  name: 'navBar',
  components: {
  }
}
</script>

<style>
.link{
  text-decoration: none;
}
nav{
  display: flex;
  align-items: center;
  justify-content: center;
  height: 60px;
}
nav .el-menu-item{
  padding-left: 100px;
  padding-right: 100px;
  text-align: center;
  font-size: larger;
}
nav .el-menu-item:hover,nav .el-menu-item:active{
  padding: 10px 100px;
  border-bottom: solid 3px;
  background-color: whitesmoke;
  border-bottom-color: orange;
  color: orange;

  /* height: 70px; */
}
</style>

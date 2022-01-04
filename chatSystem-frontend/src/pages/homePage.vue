<template>
 <div>
    <!-- <header> -->
      <slide-photo></slide-photo>
    <!-- </header> -->
  </div>
</template>

<script>
import slidePhoto from '@/components/slidePhoto.vue'
export default {
  name: 'homePage',
  components: {
    slidePhoto
  }
}
</script>

<style>
  *{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
  }
  body{
    font-family:Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
  }
  /* header{
    background:rgb(243, 241, 241);
    width: auto;
    height:60px;
  } */
</style>

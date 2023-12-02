<template>
  <div>
    <div style="text-align:left;font-size: 30px;font-weight: bold;width: 79%;margin: auto">爆款目的地</div>
    <div style="text-align: left;font-size: 20px;width: 79%;margin: auto">中国旅客热门之选</div>
    <div>
      <country1></country1>
    </div>
    <div style="width: 85%; position: relative; left: 10%">
      <country2></country2>
    </div>
  </div>
</template>

<script>
import country1 from '../components/sub_components/Com5_sub1.vue'
import country2 from '../components/sub_components/Com5_sub2.vue'

export default {
  name: "HomeView_Com5",
  components:{
    country1,
    country2,
  },
}
</script>

<style scoped>

</style>
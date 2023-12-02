<template>
  <div style="position: relative; width: 80%;left: 10%">
    <el-row style="height: 100px;z-index: 100">
      <search></search>
    </el-row>
  </div>
</template>

<script>
import search from "../components/sub_components/Com2_sub1.vue";
export default {
  name: "HomeView_Com2",
  components: {
    search,
  },
}
</script>

<style scoped>

</style>
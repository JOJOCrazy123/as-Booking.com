<template>
  <div>
    <div>
      <el-button @click="showPrev()" type="primary" icon="el-icon-arrow-left" class="pos1"></el-button>
      <el-button @click="showNext()" type="primary" icon="el-icon-arrow-right" class="pos2"></el-button>

      <div>
        &nbsp;
      </div>
      <div style="width: 100%;margin:auto;">
        <VueSlickCarousel v-bind="settings" ref="carousel" style="z-index: 2">
          <div class="wid">
            <Com8_sub1></Com8_sub1>
          </div>
          <div style="width: 10px;background-color: transparent">

          </div>
          <div class="wid">
            <Com8_sub2></Com8_sub2>
          </div>
          <div class="wid">
            <Com8_sub3></Com8_sub3>
          </div>
          <div class="wid">
            <Com8_sub4></Com8_sub4>
          </div>
          <div class="wid">
            <Com8_sub5></Com8_sub5>
          </div>
        </VueSlickCarousel>
      </div>
    </div>

  </div>
</template>

<script>
import VueSlickCarousel from "vue-slick-carousel";
import 'vue-slick-carousel/dist/vue-slick-carousel.css'
import 'vue-slick-carousel/dist/vue-slick-carousel-theme.css'
import Com8_sub1 from "../components/sub_components/Com8_sub1.vue"
import Com8_sub2 from "../components/sub_components/Com8_sub2.vue"
import Com8_sub3 from "../components/sub_components/Com8_sub3.vue"
import Com8_sub4 from "../components/sub_components/Com8_sub4.vue"
import Com8_sub5 from "../components/sub_components/Com8_sub5.vue"

export default {
  methods: {
    showNext() {
      this.$refs.carousel.next()
    },
    showPrev() {
      this.$refs.carousel.prev()
    },
  },
  data() {
    return {
      settings: {
        "variableWidth": true,
        "arrows":false,
        "dots": false,
        "dotsClass": "slick-dots custom-dot-class",
        "edgeFriction": 0.35,
        "infinite": false,
        "speed": 500,
        "slidesToShow":4,
        "slidesToScroll": 2,

      },
    };
  },
  name: "HomeView_Com8",
  components: {
    VueSlickCarousel,
    Com8_sub1,
    Com8_sub2,
    Com8_sub3,
    Com8_sub4,
    Com8_sub5,
  },
}
</script>

<style scoped>
.pos1{
  position: absolute;
  left:-2%;
  top:40%;
  z-index: 4;
  color: black;
  width: 15px;
  background: #e5e9f2;
  border: #e5e9f2;
  border-radius: 60px;
}
.pos2{
  position: absolute;
  left:97%;
  top:40%;
  z-index: 4;
  color: black;
  width: 12px;
  background: #e5e9f2;
  border: #e5e9f2;
  border-radius: 60px;
}
</style>
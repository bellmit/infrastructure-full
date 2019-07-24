// components/modal.js
Component({
  /**
   * 组件的属性列表
   */
  properties: {
    show:{
      type:Boolean,
      value:false
    },
    height:{
      type:String,
      value:"80%"
    }
  },

  /**
   * 组件的初始数据
   */
  data: {

  },

  /**
   * 组件的方法列表
   */
  methods: {
    cancel(){
      this.setData({show:false})
      this.triggerEvent('cancel')
    },
    confirm(){
      this.setData({ show: false })
      this.triggerEvent('confirm')
    }
  }
})

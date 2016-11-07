Ext.define('More.controller.ShipsController', {
    extend: 'Ext.app.Controller',
   views: ['More.view.ships.Main'],
   stores: ['More.store.Ship'],
   initialized : false,
   init : function() {
          this.control({
             'shipsgrid' : {
                 cellclick : this.oncellclick
             }
          });
          this.initialized = true;
       },
    oncellclick : function(view, cell, cellIndex, record, row, rowIndex, e ){
              this.showInfo(record);
    },
    showInfo : function(record){
      var info = "<p>";
      info +=  record.get('flagImage') ? '<img src="data:image/png;base64,'+ record.get('flagImage') +'" />'+ "<br/>" : '';
      info +=  "Наименование : " + record.get('name') + "<br/>";
      info +=  "Позывной : " + record.get('callSign') + "<br/>";
      info +="</p>";
      if (!info)
         info = "Информация отсутствует";

      Ext.Msg.alert('Информация',info);
}
});

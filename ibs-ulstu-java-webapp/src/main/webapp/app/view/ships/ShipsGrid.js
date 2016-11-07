Ext.define('More.view.ships.ShipsGrid', {
    extend : 'Ext.grid.Panel',
    columnLines: true,
    autoScroll: true,
    alias: 'widget.shipsgrid',
    store: 'More.store.Ship',
    columns : [],
    initComponent: function(arguments){
            this.columns = [{
                         header: 'Флаг',
                         dataIndex: 'flagImage',
                         sortable : false,
                         align: 'center',
                         renderer:function(v) {
                                   if (v)
                                    return '<img src="data:image/png;base64,'+ v.toString() +'" />';
                                   else
                                    return '-';
                                    },
                     }, {
                         header: 'Наименование',
                         dataIndex: 'name',
                         flex:1
                     }, {
                         header: 'Наименование (лат.)',
                         dataIndex: 'nameLat',
                         sortable : false,
                         flex:1
                     }, {
                         header: 'Позывной',
                         dataIndex: 'callSign',
                         sortable : false,
                         flex:1
                     }, {
                         header: 'IMO',
                         dataIndex: 'imo',
                         sortable : false,
                         flex:1
                     },{
                         header: 'MMSI',
                         dataIndex: 'mmsi',
                         sortable : false,
                         flex:1
                        }];
            this.dockedItems = [];
          this.callParent(arguments);

       }
});

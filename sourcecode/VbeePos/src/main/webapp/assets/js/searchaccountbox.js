const datasource = [ {
	"id" : 1,
	"name" : 'Giáp Minh Cương'
}, {
	"id" : 2,
	"name" : 'Vũ Thị Trần Vân'
}, {
	"id" : 3,
	"name" : 'Nguyễn Hoàng Anh '
}
// ...
]

$('#receiver').autocomplete({
	nameProperty : 'name',
	valueProperty : 'id',
	valueField : '#receiver_id',
	dataSource : datasource
});

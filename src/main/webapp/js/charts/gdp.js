/* 对应flot.html */

  $(function () {

    /*
     * BAR CHART
     * ---------
     */

	  $.post("/yjsj/gdp/findAll.do",function(result){
		  if(result.status==0){
			  var gdp = result.data;
			  
			  var bar_data = {
				      data : [[gdp[0].year, gdp[0].value], [gdp[1].year, gdp[1].value], [gdp[2].year, gdp[2].value], 
				    	  [gdp[3].year, gdp[3].value], [gdp[4].year, gdp[4].value], [gdp[5].year, gdp[5].value],
				    	  [gdp[6].year, gdp[6].value],[gdp[7].year, gdp[7].value],[gdp[8].year, gdp[8].value],[gdp[9].year, gdp[9].value]],
				      color: '#3c8dbc'
				    }
				    $.plot('#bar-chart', [bar_data], {
				      grid  : {
				        borderWidth: 1,
				        borderColor: '#f3f3f3',
				        tickColor  : '#f3f3f3'
				      },
				      series: {
				        bars: {
				          show    : true,
				          barWidth: 0.5,
				          align   : 'center'
				        }
				      },
				      xaxis : {
				        mode      : 'categories',
				        tickLength: 0
				      }
				    })
		  }
	  },'json')
   
    /* END BAR CHART */

  })

  /*
   * Custom Label formatter
   * ----------------------
   */
  function labelFormatter(label, series) {
    return '<div style="font-size:13px; text-align:center; padding:2px; color: #fff; font-weight: 600;">'
      + label
      + '<br>'
      + Math.round(series.percent) + '%</div>'
  }

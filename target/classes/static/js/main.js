jQuery(document).ready(function($) {
    "use strict";

    $(function() {
        //Keep track of last scroll
        var lastScroll = 0;
        var header = $("#header");
        var headerfixed = $("#header-main-fixed");
        var headerfixedbg = $(".header-bg");
        var headerfixedtopbg = $(".top-header-bg");
        $(window).scroll(function() {
            //Sets the current scroll position
            var st = $(this).scrollTop();
            //Determines up-or-down scrolling
            
            if (st > lastScroll) {

                //Replace this with your function call for downward-scrolling
                if (st > 50) {
                	
                    header.addClass("header-top-fixed");
                    header.find(".header-top-row").addClass("dis-n");
                    headerfixedbg.addClass("header-bg-fixed");
                    headerfixed.addClass("header-main-fixed");
                    headerfixedtopbg.addClass("top-header-bg-fix");
                }
            }
            else {
                //Replace this with your function call for upward-scrolling
                if (st < 50) {
                    header.removeClass("header-top-fixed");
                    header.find(".header-top-row").removeClass("dis-n");
                    headerfixed.removeClass("header-main-fixed");
                    headerfixedbg.removeClass("header-bg-fixed");
                    headerfixedtopbg.removeClass("top-header-bg-fix");
                    //headerfixed.addClass("header-main-fixed")
                }
            }
            //Updates scroll position
            lastScroll = st;
        });
        
        
//        $ripples.on('animationend webkitAnimationEnd mozAnimationEnd oanimationend MSAnimationEnd', function(e) {
//      	  	$(this).removeClass('is-active');
//      	  });
    });
    
    
//    $(window, document, undefined).ready(function() {

//  	  $('input').blur(function() {
//  	    var $this = $(this);
//  	    if ($this.val())
//  	      $this.addClass('used');
//  	    else
//  	      $this.removeClass('used');
//  	  });
//
//  	  var $ripples = $('.ripples');

//  	  $ripples.on('click.Ripples', function(e) {
//
//  	    var $this = $(this);
//  	    var $offset = $this.parent().offset();
//  	    var $circle = $this.find('.ripplesCircle');
//
//  	    var x = e.pageX - $offset.left;
//  	    var y = e.pageY - $offset.top;
//
//  	    $circle.css({
//  	      top: y + 'px',
//  	      left: x + 'px'
//  	    });
//
//  	    $this.addClass('is-active');
//
//  	  });

//  	  $ripples.on('animationend webkitAnimationEnd mozAnimationEnd oanimationend MSAnimationEnd', function(e) {
//  	  	$(this).removeClass('is-active');
//  	  });

//  	});
});


//var lcUrl = "http://localhost:8090/";
//var and = {
//		initialize : function() {
//			this.bindEvents();
//		},AjaxCall : function(ObjMethod, ObjData, ObjUrl, handleData){
//			lcFuntion = "AjaxCall";
//			console.log("Function run : " + lcFuntion);
//			
//			$.ajax({
//				type : ObjMethod,
//				url : lcUrl + ObjUrl,
//				data : {
//					"dataId" : ObjData
//				}, //JSON.stringify(lcdata)
//				beforeSend : function(xhr) {
//					xhr.setRequestHeader("Accept", "application/json");
//					xhr.setRequestHeader("Content-Type", "application/json"); 
//				// contentType: "application/x-www-form-urlencoded; charset=UTF-8", //sending
//				//		                $('#loader').show();
//				},
//				success : function(response) {
//					handleData(response);
//				}, //timeout:3000,
//				error : function(jqXhr, textStatus, errorThrown) {
//					getError(jqXhr)
//				}
//			});
//			
//		},FormView : function(Obj){
//			lcFuntion = "FormView";
//			console.log("Function run : " + lcFuntion);
//			
//			$("#ModalCrud").empty();
//			and.AjaxCall("GET", $(Obj).data('itemid'), $(Obj).data('url'), function(output) {
//				
//				$("#ModalCrud").append(output);
//				$("#ModalCrud").delay(200).fadeIn(500);
//
//				//				$('.selectpicker').selectpicker();
////				$(document).ajaxStart(function() {
////					Pace.restart();
////				});
//				
//
//				$('form').submit(function(ev) {
//					var form = $(this)[0];
//					var mydata = new FormData(form);
//					var pagetype = $(this).data('form');
//
////					if ($(this).attr('action') == "add-event") {
////						mydata = appmain.SetUtil($(this).attr('action'));
////						appmain.GetAjaxJson("POST", mydata, $(this).attr('action'), function(output) {
////							appmain.ProcessData(output, pagetype);
////						});
////					} else if ($(this).attr('action') == "add-product") {
////						appmain.GetAjaxUpload("POST", mydata, $(this).attr('action'), function(output) {
////							appmain.ProcessData(output, pagetype);
////						});
////					} else {
////						//must be call GetAjaxJson 
////					}
//
//
//					ev.preventDefault();
//				});
//				$("form input:text").first().focus();	
//			});
//			
//		},FormClose : function(Obj){
//			lcFuntion = "FormClose";
//			console.log("Function run : " + lcFuntion);
//			
//			dtc = $(Obj).data("close");
//			lcdiv = $("#" + dtc);
//			lcdiv.fadeOut(500).delay(200)
//		}
//}
//
//
//$(window, document, undefined).ready(function() {
//
//	  $('input').blur(function() {
//	    var $this = $(this);
//	    if ($this.val())
//	      $this.addClass('used');
//	    else
//	      $this.removeClass('used');
//	  });
//
//	  var $ripples = $('.ripples');
//
//	  $ripples.on('click.Ripples', function(e) {
//
//	    var $this = $(this);
//	    var $offset = $this.parent().offset();
//	    var $circle = $this.find('.ripplesCircle');
//
//	    var x = e.pageX - $offset.left;
//	    var y = e.pageY - $offset.top;
//
//	    $circle.css({
//	      top: y + 'px',
//	      left: x + 'px'
//	    });
//
//	    $this.addClass('is-active');
//
//	  });
//
//	  $ripples.on('animationend webkitAnimationEnd mozAnimationEnd oanimationend MSAnimationEnd', function(e) {
//	  	$(this).removeClass('is-active');
//	  });
//
//	});





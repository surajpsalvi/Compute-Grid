<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
		<title>VISU Grid</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
		<link rel="stylesheet" type="text/css" href="css/font-awesome.css">
		<link rel='stylesheet' id='camera-css'  href='css/camera.css' type='text/css' media='all'>

		<link rel="stylesheet" type="text/css" href="css/slicknav.css">
		<link rel="stylesheet" href="css/prettyPhoto.css" type="text/css" media="screen" title="prettyPhoto main stylesheet" charset="utf-8" />
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<link rel="shortcut icon" type="image/x-icon" href="images/logo.png" />
		
		<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>

		<link href='http://fonts.googleapis.com/css?family=Roboto:400,300,700|Open+Sans:700' rel='stylesheet' type='text/css'>
		<script type="text/javascript" src="js/jquery.mobile.customized.min.js"></script>
		<script type="text/javascript" src="js/jquery.easing.1.3.js"></script> 
		<script type="text/javascript" src="js/camera.min.js"></script>
		<script type="text/javascript" src="js/myscript.js"></script>
		<script src="js/sorting.js" type="text/javascript"></script>
		<script src="js/jquery.isotope.js" type="text/javascript"></script>
		<!--script type="text/javascript" src="js/jquery.nav.js"></script-->
		<script type="text/javascript">
		function validate() 
		{			
			var x =document.getElementById("fn").value;
			var y =document.getElementById("sn").value;
			var z =document.getElementById("tn").value;
			var q =document.getElementById("ln").value;
			
			  if (isNaN(x)) 
			  {
				  document.getElementById("fn").style.border="1px solid red";
			    	return false;
			  }
			  if (isNaN(y)) 
			  {
				  document.getElementById("sn").style.border="1px solid red";
			    	return false;
			  }
			  if (isNaN(z)) 
			  {
				  document.getElementById("tn").style.border="1px solid red";
			    	return false;
			  }
			  if (isNaN(q)) 
			  {
				  document.getElementById("ln").style.border="1px solid red";
			    	return false;
			  }
			  else
			  {				  
				  return true;				  
			  }
			  
		return true;
		}
		
	</script>		

		<script>
			jQuery(function(){
					jQuery('#camera_wrap_1').camera({
					transPeriod: 500,
					time: 3000,
					height: '490px',
					thumbnails: false,
					pagination: true,
					playPause: false,
					loader: false,
					navigation: false,
					hover: false
				});
			});
		</script>
		
	</head>
	<body>
    
    <!--home start-->
    
    <div id="home">
    	<div class="headerLine">
	<div id="menuF" class="default">
		<div class="container">
			<div class="row">
				<div class="logo col-md-4">
					<div>
						<a href="#">
							<img src="images/logo.png">
						</a>
					</div>
				</div>
				<div class="col-md-8">
					<div class="navmenu"style="text-align: center;">
						<ul id="menu">
							<li class="active" ><a href="#home">Home</a></li>
							<li><a href="#about">Compute by giving input</a></li>
							<li><a href="#project">Compute using file</a></li>								
							<!--li><a href="#features">Features</a></li-->
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
		<div class="container">
			<div class="row wrap">
				<div class="col-md-12 gallery"> 
						<div class="camera_wrap camera_white_skin" id="camera_wrap_1">
							<div data-thumb="" data-src="images/slides/blank.gif">
								<div class="img-responsive camera_caption fadeFromBottom">
									<h2>VISU Grid.</h2>
								</div>
							</div>
							<div data-thumb="" data-src="images/slides/blank.gif">
								<div class="img-responsive camera_caption fadeFromBottom">
									<h2>Ignite Grid.</h2>
								</div>
							</div>
							<div data-thumb="" data-src="images/slides/blank.gif">
								<div class="img-responsive camera_caption fadeFromBottom">
									<h2>Computing Grid.</h2>
								</div>
							</div>
						</div><!-- #camera_wrap_1 -->
				</div>
			</div>
		</div>
	</div>
		  
    </div>
    
   
		
		<div class="container">
			<div class="row">
				<div class="col-md-12 hr1">
					<hr/>
				</div>
			</div>
		</div>		
		<div class="container">
		<!-- 
			<div class="row">
			
				<div class="col-md-3 bar">
					<div class="progB chart" data-percent="100"  data-animate="3500">
						<div class="chart chart-content">
							<div class="percentage" data-percent="64">
							  <span class="percent">100</span>
							</div>
						</div>
					</div>
					<div class="textP">
						<h3>Processor</h3>
						<p>Using 4 nodes and Their 4 Processors. </p>
					</div>
				</div>
				<div class="col-md-3 bar">
					<div class="progB chart" data-percent="100"  data-animate="3500">
						<div class="chart chart-content">
							<div class="percentage" data-percent="22">
							  <span class="percent">100</span>
							</div>
						</div>
					</div>
					<div class="textP">
						<h3>Cores</h3>
						<p>Using 28 Cores of from all the nodes</p>
					</div>
				</div>
				<div class="col-md-3 bar ">
					<div class="progB chart" data-percent="100"  data-animate="3500">
						<div class="chart chart-content">
							<div class="percentage" data-percent="100">
							  <span class="percent">100</span>
							</div>
						</div>
					</div>
					<div class="textP">
						<h3>Memory</h3>
						<p>Using 4 GB of Memory from each node 1GB.</p>
					</div>
				</div>
				<div class="col-md-3 bar ">
					<div class="progB chart" data-percent="100"  data-animate="3500">
						<div class="chart chart-content">
							<div class="percentage" data-percent="100">
							  <span class="percent">100</span>
							</div>
						</div>
					</div>
					<div class="textP">
						<h3>Computation</h3>
						<p>Performing accurate multiplication.</p>
					</div>
				</div>
			</div>
		
		</div>	
		
		
		<div class="container">
			<div class="row aboutUs">
				<div class="col-md-12 ">
					<h3>VISU Grid Features</h3>
				</div>
			</div>
		</div>
			-->	
    </div>    
    
       <div class="container">	
			
			<script type="text/javascript">
				jQuery(window).load(function(){
					items_set = [
					
						{category : 'branding', lika_count : '77', view_count : '234', src : 'images/prettyPhotoImages/pic9.jpg', title : 'Foil Mini Badges', content : '' },
						
						{category : 'polygraphy', lika_count : '45', view_count : '100', src : 'images/prettyPhotoImages/pic7.jpg', title : 'Darko – Business Card Mock Up', content : '' },
						
						{category : 'text_styles', lika_count : '22', view_count : '140', src : 'images/prettyPhotoImages/pic8.jpg', title : 'Woody Poster Text Effect', content : '' }
						

					];
					jQuery('.portfolio_block').portfolio_addon({
						type : 1, // 2-4 columns simple portfolio
						load_count : 3,
						
						items : items_set
					});
					$('#container').isotope({
					  animationOptions: {
						 duration: 900,
						 queue: false
					   }
					});
				});
				
				
				// =============================
									
			</script>
		</div>
    </div>    
    
    <!--news start-->
    
    <div id="about">
    	<div class="line4">		
			<div class="container">
				<div class="row Ama">
					<div class="col-md-12">
					<h3>Use VISU Grid</h3>
					<p>Use the computing grid by providing numeric input here.</p>
					</div>
				</div>
			</div>
		</div>														
       

    <div class="container" id="myDiv">
			<div class="row">
				<div class="col-md-9 col-xs-12 forma">
					<form method="get" action="boothalgo">
					<p id="msg"></p>
						<input type="text" class="col-md-6 col-xs-12 name" name='fn' id='fn' placeholder='Enter multiplicant *' required/>
						<input type="text" class="col-md-6 col-xs-12 Email" name='sn' id='sn' placeholder='Enter multiplier *' required/>
						<input type="text" class="col-md-6 col-xs-12 name" name='tn' id='tn' placeholder='Enter multiplicant *' required/>
						<input type="text" class="col-md-6 col-xs-12 Email" name='ln' id='ln' placeholder='Enter multiplier *' required/>
						<!--<input type="text" class="col-md-12 col-xs-12 Subject" name='Subject' placeholder='Enter '/>
						<textarea type="text" class="col-md-12 col-xs-12 Message" name='Message' placeholder='Message *'></textarea>-->
						
						<div class="cBtn col-xs-12">
							<ul>								
								<button class="send" type="reset">Clear Numbers</button>
								<!-- <li class="send"><a href="#" onclick="loadXMLDoc()"><i class="fa fa-share"></i>Start Computation</a></li>-->
								<button onclick="return validate();" class="send" type="submit">Perform Computation</button>
																
							</ul>
						</div>
					</form>
				</div>
				<div class="col-md-3 col-xs-12 cont">
					<ul>
						<!--<li><i class="fa fa-home"></i>5512 Lorem Ipsum Vestibulum 666/13</li>
						<li><i class="fa fa-phone"></i>+1 800 789 50 12, +1 800 450 6935</li>
						<li><a href="#"><i class="fa fa-envelope"></i>mail@compname.com</li></a>
						<li><i class="fa fa-skype"></i>compname</li>
						<li><a href="#"><i class="fa fa-twitter"></i>Twitter</li></a>
						<li><a href="#"><i class="fa fa-facebook-square"></i>Facebook</li></a>
						<li><a href="#"><i class="fa fa-dribbble"></i>Dribbble</li></a>
						<li><a href="#"><i class="fa fa-flickr"></i>Flickr</li></a>
						<li><a href="#"><i class="fa fa-youtube-play"></i>YouTube</li></a>-->
					</ul>
				</div>
			</div>
		</div>		
       					
    </div>            
		<div class="line7" id="project">
			<div class="container">
				<div class="row footer">
					<div class="col-md-12">
					<form method="post" action="boothAlgoFile"  enctype="multipart/form-data">
					                                                                 <p>
   					
							<h3>OR</h3>
								<%
										if(request.getParameter("msg")!=null)
								        {
								            out.print("<p style='text-color:red'>"+request.getParameter("msg")+"</p>");
								        }        
								%>	
							<p> You can upload input files .txt only..!</p>
							<div class="fr">
								<div style="display: inline-block;">
			                        <p><input class="col-md-6 fEmail" type="file" accept=".txt"  name="Input1" required></p>
			                    </div>
			                                   
			                    <div style="display: inline-block;">                                     
			                        <p><input class="col-md-6 fEmail" type="file" accept=".txt" name="Input2" required></p>                                                    
								</div>
								
								<div style="display: inline-block;">
									<button class="subS" type="submit">Perform Computation</button>							
								</div>
							</div>		
						</form>			
					</div>
					<!--<div class="soc col-md-12">
						<ul>
							<li class="soc1"><a href="#"></a></li>
							<li class="soc2"><a href="#"></a></li>
							<li class="soc3"><a href="#"></a></li>
							<li class="soc4"><a href="#"></a></li>
							<li class="soc5"><a href="#"></a></li>
							<li class="soc6"><a href="#"></a></li>
							<li class="soc7"><a href="#"></a></li>
							<li class="soc8"><a href="#"></a></li>
							
						</ul>
					</div>-->
				</div>
			</div>
		</div>
		<div class="lineBlack">
			<div class="container">
				<div class="row downLine">
					<div class="col-md-12 text-right">
						<!--input  id="searchPattern" type="search" name="pattern" value="Search the Site" onblur="if(this.value=='') {this.value='Search the Site'; }" onfocus="if(this.value =='Search the Site' ) this.value='';this.style.fontStyle='normal';" style="font-style: normal;"/-->
						<!--<input id="searchPattern" type="search" placeholder="Search the Site"><i class="glyphicon glyphicon-search" style="font-size: 13px; color:#a5a5a5;" id="iS"></i>-->
					</div>
					<div class="col-md-6 text-left copy">
						<p>Copyright © 2015 PICT. All Rights Reserved.</p>
					</div>
					<div class="col-md-6 text-right dm">
						<ul id="downMenu">							
							<li class="active" ><a href="#home">Home</a></li>
							<li><a href="#about">Compute by giving input</a></li>
							<li><a href="#project">Compute using file</a></li>		
							<!--li><a href="#features">Features</a></li-->
						</ul>
					</div>
				</div>
			</div>
		</div>
    </div>
		
	<script src="js/jquery.prettyPhoto.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.slicknav.js"></script>
	<script>
			$(document).ready(function(){
			$(".bhide").click(function(){
				$(".hideObj").slideDown();
				$(this).hide(); //.attr()
				return false;
			});
			$(".bhide2").click(function(){
				$(".container.hideObj2").slideDown();
				$(this).hide(); // .attr()
				return false;
			});
				
			$('.heart').mouseover(function(){
					$(this).find('i').removeClass('fa-heart-o').addClass('fa-heart');
				}).mouseout(function(){
					$(this).find('i').removeClass('fa-heart').addClass('fa-heart-o');
				});
				
				function sdf_FTS(_number,_decimal,_separator)
				{
				var decimal=(typeof(_decimal)!='undefined')?_decimal:2;
				var separator=(typeof(_separator)!='undefined')?_separator:'';
				var r=parseFloat(_number)
				var exp10=Math.pow(10,decimal);
				r=Math.round(r*exp10)/exp10;
				rr=Number(r).toFixed(decimal).toString().split('.');
				b=rr[0].replace(/(\d{1,3}(?=(\d{3})+(?:\.\d|\b)))/g,"\$1"+separator);
				r=(rr[1]?b+'.'+rr[1]:b);

				return r;
}
				
			setTimeout(function(){
					$('#counter').text('0');
					$('#counter1').text('0');
					$('#counter2').text('0');
					setInterval(function(){
						
						var curval=parseInt($('#counter').text());
						var curval1=parseInt($('#counter1').text().replace(' ',''));
						var curval2=parseInt($('#counter2').text());
						if(curval<4){
							$('#counter').text(curval+1);
						}
						if(curval1<28){
							$('#counter1').text(sdf_FTS((curval1+1),0,' '));
						}
						if(curval2<4){
							$('#counter2').text(curval2+1);
						}
					}, 2);
					
				}, 500);
			});
	</script>
	<script type="text/javascript">
	jQuery(document).ready(function(){
		jQuery('#menu').slicknav();
		
	});
	</script>
	
	<script type="text/javascript">
    $(document).ready(function(){
       
        var $menu = $("#menuF");
            
        $(window).scroll(function(){
            if ( $(this).scrollTop() > 100 && $menu.hasClass("default") ){
                $menu.fadeOut('fast',function(){
                    $(this).removeClass("default")
                           .addClass("fixed transbg")
                           .fadeIn('fast');
                });
            } else if($(this).scrollTop() <= 100 && $menu.hasClass("fixed")) {
                $menu.fadeOut('fast',function(){
                    $(this).removeClass("fixed transbg")
                           .addClass("default")
                           .fadeIn('fast');
                });
            }
        });
	});
    //jQuery
	</script>
	<script>
		/*menu*/
		function calculateScroll() {
			var contentTop      =   [];
			var contentBottom   =   [];
			var winTop      =   $(window).scrollTop();
			var rangeTop    =   200;
			var rangeBottom =   500;
			$('.navmenu').find('a').each(function(){
				contentTop.push( $( $(this).attr('href') ).offset().top );
				contentBottom.push( $( $(this).attr('href') ).offset().top + $( $(this).attr('href') ).height() );
			})
			$.each( contentTop, function(i){
				if ( winTop > contentTop[i] - rangeTop && winTop < contentBottom[i] - rangeBottom ){
					$('.navmenu li')
					.removeClass('active')
					.eq(i).addClass('active');				
				}
			})
		};
		
		$(document).ready(function(){
			calculateScroll();
			$(window).scroll(function(event) {
				calculateScroll();
			});
			$('.navmenu ul li a').click(function() {  
				$('html, body').animate({scrollTop: $(this.hash).offset().top - 80}, 800);
				return false;
			});
		});		
	</script>	
	<script type="text/javascript" charset="utf-8">

		jQuery(document).ready(function(){
			jQuery(".pretty a[rel^='prettyPhoto']").prettyPhoto({animation_speed:'normal',theme:'light_square',slideshow:3000, autoplay_slideshow: true, social_tools: ''});
			
		});
	</script>
	</body>
	
</html>
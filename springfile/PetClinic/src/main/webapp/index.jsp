
<body>
	<!-- section banner start -->
	
	<%@include file="banner.jsp" %>
	  
	<!-- section banner end -->
	<!-- section about start -->
	
	
	<%@include file="aboutSection.jsp" %>
	<!-- section about end -->
	<!-- section gallery start -->
     <%@include file="gallerySection.jsp" %>    
	<!-- section gallery end -->
	<!-- section get in touch start -->
    <%@include file="Sections.jsp" %>
    <!-- section get in touch end -->

	<!-- section footer start -->
         <%@include file="Footer.jsp" %>  
	<!-- section footer end -->

    <!-- Javascript files-->
    <script src="js/jquery.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.bundle.min.js"></script>
      <script src="js/jquery-3.0.0.min.js"></script>
      <script src="js/plugin.js"></script>
      <!-- sidebar -->
      <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
      <script src="js/custom.js"></script>
      <!-- javascript --> 
      <script src="js/owl.carousel.js"></script>
      <script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>
      <script>
      $(document).ready(function(){
      $(".fancybox").fancybox({
         openEffect: "none",
         closeEffect: "none"
         });
         
         $(".zoom").hover(function(){
         
         $(this).addClass('transition');
         }, function(){
         
         $(this).removeClass('transition');
         });
         });
         </script> 


   <script>
    function openNav() {
    document.getElementById("myNav").style.width = "100%";
    }

    function closeNav() {
   document.getElementById("myNav").style.width = "0%";
   }
</script>
     
</body>
</html>
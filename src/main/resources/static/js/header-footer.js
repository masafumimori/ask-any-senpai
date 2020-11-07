$(() => {
  //Change opacity of scroll button
  const scrollTop = $(".scroll-top");
  $(window).scroll(function(){
    let position = $(this).scrollTop();

    if(position > 100){
      $(scrollTop).css("opacity", "1");
    } else {
      $(scrollTop).css("opacity", "0");
    }
  });

  //When pressing scroll top button
  $(".scroll-top").on("click", function(){
    $("html, body").animate({
      scrollTop: 0
    }, 500);
  });

  //When pressing login button
  $(".login-btn").on("click", () => {
    location.replace("/studyabroad/user/login_page");
  });

  //When pressing signup button
  $(".signup-btn").on("click", () => {
    location.replace("/studyabroad/user/signup_page");
  });

  //When pressing mypage button
  $(".mypage-btn").on("click", () => {
    location.replace("/studyabroad/user/mypage");
  });

  //When pressing logout button
  $(".logout-btn").on("click", (event) => {
    event.preventDefault();

    $.ajax({
      type: "POST",
      url: "/studyabroad/user/logout",
      datatype: "json",
    }).then(
      (result) => {
        alert("Logged out!");
        location.replace("/studyabroad/");
      },
      () => {
        alert("Logout failed.");
      }
    );
  });

  //When pressing terms button
  $(".terms-btn").on("click", () => {
    location.replace("/studyabroad/terms");
  });

  //When pressing contact button
  $(".contact-btn").on("click", () => {
    location.replace("/studyabroad/contact");
  });

  //When pressing policy button
  $(".policy-btn").on("click", () => {
    location.replace("/studyabroad/policy");
  });

  //When pressing senapi search button
  $(".senpai-search-btn").on("click", () => {

    // Scroll if search section is on the current page
    if($(".search-section").length > 0){
      let position = $(".search-section").position().top;
      $("html, body").animate({
        scrollTop: position
      }, 500);
    } else {
      // Page relocate if search section is NOT on the current page
      location.replace("/studyabroad/search-senpai");
    }
  })
});

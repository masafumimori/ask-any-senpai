$(() => {
  //When pressing login button
  $(".login-btn").on("click", () => {
    location.replace("/studyabroad/user/login_page");
  });

  //When pressing signup button
  $(".signup-btn").on("click", () => {
    location.replace("/studyabroad/user//signup_page");
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
});

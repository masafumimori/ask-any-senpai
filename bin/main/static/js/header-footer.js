$(() => {
  $(".login-btn").on("click", () => {
    location.replace("/studyabroad/user/login_page");
  });

  $(".signup-btn").on("click", () => {
    location.replace("/studyabroad/user//signup_page");
  });

  $(".mypage-btn").on("click", () => {
    location.replace("/studyabroad/user/mypage");
  });

  $(".logout-btn").on("click", () => {
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
});

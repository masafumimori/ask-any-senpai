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

  $(".terms-btn").on("click", () => {
    location.replace("/studyabroad/terms");
  });
});

$(() => {

    const required_message = "必須項目です。ご入力下さい。";

    // 新規登録フォーム正規表現
    $(".form").validate({

        rules: {
            userName: {
                required: true,
                minlength: 4
            },

            password: {
                required: true,
                minlength: 4
            },

            rePassword: {
                required: true,
                minlength: 4,
                equalTo: "#password"
            },

            email: {
                required: true,
                email: true
            },

            reEmail: {
                required: true,
                email: true,
                equalTo: "#email"
            }
        },
        messages: {

            userName: {
                required: required_message,
                minlength: "4文字以上でご入力ください。"
            },

            password: {
                required: required_message,
                minlength: "4文字以上でご入力ください。"
            },

            rePassword: {
                required: required_message,
                minlength: "4文字以上でご入力ください。",
                equalTo: "パスワードが異なります。再度ご入力ください。"
            },

            email: {
                required: required_message,
                email: "正しいメールアドレスをご入力ください。"
            },

            reEmail: {
                required: required_message,
                email: "正しいメールアドレスをご入力ください。",
                equalTo: "メールアドレスが異なります。再度ご入力ください。"
            } 
        },
        
        // Change the place of error messages to after input-box
        errorPlacement: function(error, element){
            error.appendTo(element.parent().next(".error-messages"));
        },

        // Add error class to invalid input
        errorClass: "withError",
        highlight: function(element, errorClass) {
            $(element).parent().addClass(errorClass);
        },
        unhighlight: function(element, errorClass) {
            $(element).parent().removeClass(errorClass);
        },

        // Submit using ajax when form is valid
        // submitHandler: function(form){
        //     $(form).ajaxSubmit();
        // },

        // When inputs are invalid
        invalidHandler: function(event, validator){
            let errors = validator.numberOfInvalids();
            let errorMsg = "正しく入力されていない項目があります。";
            if(errors > 0){
                $(".invalidForm").html(errorMsg);
            }else {
                $(".invalidForm").hide();
            }
        }
    });



    // 問い合わせフォーム正規表現
    $("form[name='contactForm']").validate({

        // FocusアウトでValidation実行
        onfocusout: function(element){
            $(element).valid();
        },
        rules: {
            name: {
                required: true
            },

            email: {
                required: true,
                email: true
            },

            content: {
                required: true,
                minlength: 20
            }
        },
        messages: {

            name: {
                required: required_message,
            },

            email: {
                required: required_message,
                email: "正しいメールアドレスをご入力ください。"
            },

            content: {
                required: required_message,
                minlength: "20文字以上でお問い合わせ内容を記述してください。"
            } 
        },
        
        // Change the place of error messages to after input-box
        errorPlacement: function(error, element){
            error.appendTo(element.parent().next(".error-messages"));
        },

        // Add error class to invalid input
        errorClass: "withError",
        highlight: function(element, errorClass) {
            $(element).addClass(errorClass);
        },
        unhighlight: function(element, errorClass) {
            $(element).removeClass(errorClass);
        },

        // When inputs are invalid
        invalidHandler: function(event, validator){
            let errors = validator.numberOfInvalids();
            let errorMsg = "正しく入力されていない項目があります。";
            if(errors > 0){
                $(".invalidForm").html(errorMsg);
            }else {
                $(".invalidForm").hide();
            }
        }
    });
})
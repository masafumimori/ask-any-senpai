$(() => {

    const required_message = "必須項目です。ご入力下さい。";

    $(".form").validate({

        rules: {
            userName: {
                required: true,
                minlength: 4
            },

            password: {
                required: true
            },

            rePassword: {
                required: true,
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
                minlength: "４文字以上でご入力ください。"
            },

            password: {
                required: required_message
            },

            rePassword: {
                required: required_message,
                equalTo: "上記のパスワードと異なります。再度ご入力ください。"
            },

            email: {
                required: required_message,
                email: "正しいメールアドレスをご入力ください。"
            },

            reEmail: {
                required: required_message,
                email: "正しいメールアドレスをご入力ください。",
                equalTo: "上記のメールアドレスと異なります。再度ご入力ください。"
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
        submitHandler: function(form){
            $(form).ajaxSubmit();
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
    })
})
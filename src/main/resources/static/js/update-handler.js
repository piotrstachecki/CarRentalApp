document.addEventListener("DOMContentLoaded", function () {
    const form = document.querySelector("form");

    form.addEventListener("submit", function (event) {
        let dateInputs = document.querySelectorAll("input[type='date']");

        dateInputs.forEach(input => {
            if (!input.value) {
                input.remove();
            }
        });
    });
});
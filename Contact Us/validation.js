// adapted from https://www.codeply.com/go/mhkMGnGgZo/bootstrap-4-validation-example

$("#bootstrapForm").submit(function(event) {

    // make selected form variable
    var vForm = $(this);
    
  /*
  If not valid prevent form submit
  https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/checkValidity
  */
    if (vForm[0].checkValidity() === false) {
      event.preventDefault()
      event.stopPropagation()
    } else {
     
      // Replace alert with ajax submit here...
      alert("SUCCESSFULLY SUBMITTED ! ");
      
    }
    
    // Add bootstrap 4 was-validated classes to trigger validation messages
    vForm.addClass('was-validated');
    
 
});
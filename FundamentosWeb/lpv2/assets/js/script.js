let email = document.querySelector('#email')

function validaEmail() {
  let txtEmail = document.querySelector('#txtEmail') 

  if (email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1 ) {
     txtEmail.innerHTML = 'E-mail inválido :('
     txtEmail.style.color = 'white'
  } else {
     txtEmail.innerHTML = 'E-mail válido :)'
     txtEmail.style.color = 'white'
     emailOk = true
  }
}

function enviar() {
  if (emailOk == true) {
     alert ('Formulário enviado com sucesso!')
  } else {
     alert ('Preencha o formulário corretamente antes de enviar...')
  }
}
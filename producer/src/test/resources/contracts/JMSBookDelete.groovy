package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    name "foo"
    label "contrato_mensajes"
    input {
        messageFrom("jms:delete")
        messageBody([
                bookName: "libro"
        ])
        messageHeaders {
            header("muestra","cabecera")
        }
    }
}
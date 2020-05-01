package contracts

import org.springframework.cloud.contract.spec.Contract
[
        Contract.make {
            description ("notification Contract")
            name ("newNotification")
            request {
                method ("GET")
                url("/newNotification") {
                    queryParameters {
                        parameter("userID", "1")
                        parameter("content", "ordering Successfully")
                    }
                }
            }
            response {
                body("success")
                status (200)
            }
        },
        Contract.make {
            description ("notification Contract")
            name ("Ordering_getNotification")
            request {
                method ("GET")
                url("/getNotification") {
                    queryParameters {
                        parameter("userID", "1")
                    }
                }
            }
            response {
                status (200)
            }
        }
]
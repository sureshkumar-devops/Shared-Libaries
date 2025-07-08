def call(){    
    timeout(time: 1 , unit: "MINUTES"){
        waitForQualityGate abortPipeline: false
       // def qg = waitForQualityGate()
       // if (qg.status != 'OK'){
       //    error "Pipeline aborted due to Quality Gate Failure: ${qg.status}"   
        }
    }


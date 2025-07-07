def call(){    
    timeout(time: 5 , unit: "MINUTES"){
        waitForQualityGate abortPipeline: true
       // def qg = waitForQualityGate()
       // if (qg.status != 'OK'){
       //    error "Pipeline aborted due to Quality Gate Failure: ${qg.status}"   
        }
    }
}

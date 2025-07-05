def call(){    
    timeout(time: 1 , unit: "MINUTES"){
        waitQualityGate abortPipeline:false
    }
}

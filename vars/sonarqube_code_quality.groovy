def call(){    
    timeout(time: 1 , unit: "MINUTES"){
        withForQualityGate abortPipeline: false
    }
}

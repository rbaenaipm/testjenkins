pipeline {

  environment {
    dockerimagename = "thetips4you/nodeapp"
    dockerImage = ""
  }
  agent any
  stages {
    stage('Deploying App to Kubernetes') {
      steps {
        script {
          kubernetesDeploy(configs: "kpack/stack.yaml", kubeconfigId: "test2")
          
        }
      }
    }

  }

}

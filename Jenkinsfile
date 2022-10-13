pipeline {
  agent any
  stages {
    stage ('Initialize') {
      steps {
        script {
          kubernetesDeploy(configs: "service-account.yml", kubeconfigId: "kubernetes-file")
        }
      }
    }
  }
}

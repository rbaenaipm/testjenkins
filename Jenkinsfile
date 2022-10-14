pipeline {
  agent any
  stages {
    stage ('Initialize') {
      steps {
        script {
           kubernetesDeploy kubeconfigId: 'kubernetes-file', configs: 'kpack/service-account.yaml'
        }
      }
    }
  }
}

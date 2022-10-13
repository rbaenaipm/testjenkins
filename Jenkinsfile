pipeline {
  agent any
  stages {
    stage ('Initialize') {
      steps {
        sh 'cd kpack'
        sh 'kubectl apply -f kube/.'
      }
    }
  }
}

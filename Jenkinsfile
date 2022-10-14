pipeline {
  agent any
      stages{
  stage('Apply Kubernetes files') {
    steps{
      sh 'updatedb'
      sh 'locate kubectl'
      }
    }
  }
}

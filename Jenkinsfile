pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'echo \'Hello World\''
      }
    }
    stage('Browser Test') {
      steps {
        parallel(
          "Browser Test": {
            echo 'Hello World'
            
          },
          "Chrome": {
            echo 'Hello World'
            
          }
        )
      }
    }
    stage('Static') {
      steps {
        echo 'Hello World'
      }
    }
    stage('Deploy') {
      steps {
        echo 'Hello World'
      }
    }
  }
}
pipeline {
  agent any

    stages {

        stage('Package UE') {
      steps {
         bat '''md Z:\\����ڲ���\\Nenly_4.27_79'''
         bat '''xcopy C:\\Nenly_4.27_79 Z:\\����ڲ���\Nenly_4.27_79'''
      }
        }
    }
}

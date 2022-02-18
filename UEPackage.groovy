pipeline {
  agent any

    stages {

        stage('Package UE') {
      steps {
         bat '''md Z:\\虚幻内部版\\Nenly_4.27_79'''
         bat '''xcopy C:\\Nenly_4.27_79 Z:\\虚幻内部版\Nenly_4.27_79'''
      }
        }
    }
}

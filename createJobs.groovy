pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/CodeGeta/ThemeParkRide.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}


folder('Tools') {
    description('Folder for miscellaneous tools.')
}
job('Tools/clone-repository') {
    wrappers {
        preBuildCleanup()
    }
    parameters {
        stringParam('GIT_REPOSITORY_URL', '', 'Git URL of the repository to clone')
    }
    steps {
        shell('git clone $GIT_REPOSITORY_URL')
    }
}
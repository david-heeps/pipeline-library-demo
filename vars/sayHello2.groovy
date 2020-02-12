
def call(Map config2) {
  git url: "https://github.com/david-heeps/${config2.name2}-test2"
  sh './bashtest2.sh'
}

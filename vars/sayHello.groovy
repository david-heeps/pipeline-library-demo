#!/usr/bin/env groovy

def call(def config, def config2) {
  git url: "https://github.com/david-heeps/${config.name}-worldpub"
  sh './jtest.sh'
  
  git url: "https://github.com/david-heeps/${config.name2}-test2"
  sh './bashtest2.sh'
}


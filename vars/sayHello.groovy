#!/usr/bin/env groovy

def call(Map config, Map config2) {
  git url: "https://github.com/david-heeps/${config.name}-worldpub"
  sh './jtest.sh'
  
  git url: "https://github.com/david-heeps/${config2.name2}-test2"
  sh './bashtest2.sh'
}


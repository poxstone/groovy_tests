// https://learnxinyminutes.com/docs/es-es/groovy-es/

def gcp_params = [
  dev: [prj: 'test-data-operations-dev', sa_credentials: 'sa-cf-bq-raw-to-stg-dev@test-data-operations-dev.iam.gserviceaccount.com'],
  qal: [prj: 'test-data-operations-qal', sa_credentials: 'sa-cf-bq-raw-to-stg-qal@test-data-operations-qal.iam.gserviceaccount.com'],
  prd: [prj: 'test-data-operations-prd', sa_credentials: 'sa-cf-bq-raw-to-stg-prd@test-data-operations-prd.iam.gserviceaccount.com']
]

def commando = "echo parametro ${params['dev']['sa_credentials']}"
def proccess = commando.execute()
proccess.waitFor()

proccess 
def result = proccess.text
println result
print gcp_params.dev.prj
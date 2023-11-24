// https://learnxinyminutes.com/docs/es-es/groovy-es/

def params = [
  'dev': ['prj': 'vanti-data-operations-dev', 'sa_credentials': 'sa-cf-bq-raw-to-stg-dev@vanti-data-operations-dev.iam.gserviceaccount.com'],
  'qal': ['prj': 'vanti-data-operations-qal', 'sa_credentials': 'sa-cf-bq-raw-to-stg-qal@vanti-data-operations-qal.iam.gserviceaccount.com'],
  'prd': ['prj': 'vanti-data-operations-prd', 'sa_credentials': 'sa-cf-bq-raw-to-stg-prd@vanti-data-operations-prd.iam.gserviceaccount.com']
]

def commando = "echo parametro ${params['dev']['sa_credentials']}"
def proccess = commando.execute()
proccess.waitFor()

proccess 
def result = proccess.text
println result
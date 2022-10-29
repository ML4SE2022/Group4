FROM python:3.7

COPY requirements.txt .
COPY code code
COPY short-data short-data

RUN python -m pip install --upgrade pip &&\
    pip install -r requirements.txt
    
COPY run.sh .

COPY data data

RUN chmod +x run.sh &&\
	sh run.sh


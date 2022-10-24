#!/bin/bash
echo "Hello World"

echo "Comprobamos que exista el ejecutable de kubectl"
kubectl get pods  -n testwe && echo "funciona"

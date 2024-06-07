#!/bin/sh

# Salir inmediatamente si un comando falla
set -e

# Instalar dependencias
pip install -r src/requirements.txt

# Ejecutar pruebas
pytest -q src/test/TestShapes.py
# JSON Schema Usage and Versioning

All JSON configuration files in this project reference the same schema draft: [2020-12](https://json-schema.org/draft/2020-12/schema).

## Schema Consistency

- Each file includes a `$schema` property pointing to the 2020-12 draft.
- Descriptions are provided for each schema to clarify their purpose.
- The `required` property is used to enforce mandatory fields.

## Validation

- Validate JSON files using tools like [ajv](https://ajv.js.org/) or [jsonschema](https://pypi.org/project/jsonschema/).
- Run validation as part of your build or CI pipeline to ensure data integrity.

## Versioning

- Each schema includes a `version` and `minecraft_version` property.
- Update the `version` property when making breaking changes to the schema.

## Example

```json
{
  "$schema": "https://json-schema.org/draft/2020-12/schema",
  "title": "Example",
  "description": "Example schema for demonstration.",
  "version": "1.0.0",
  "minecraft_version": "1.21.11",
  "required": ["id", "name"]
}
```

## Best Practices

- Keep schemas up to date with project requirements.
- Document any changes in this file.
- Use schema validation to catch errors early.

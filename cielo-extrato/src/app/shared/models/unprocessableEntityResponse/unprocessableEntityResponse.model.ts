import { SystemUnprocessableEntity } from './systemUnprocessableEntity.model';

export class UnprocessableEntityResponse {
  constructor(public system: SystemUnprocessableEntity, public requestURI: string, public queryString: string) {}
}
